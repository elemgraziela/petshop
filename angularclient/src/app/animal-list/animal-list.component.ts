import { Component, OnInit } from '@angular/core';
import { Animal } from '../model/animal';
import { AnimalService } from '../animal-service/animal.service';
import { ConfirmationDialogService } from '../confirmation-dialog-service/confirmation-dialog.service';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

    animals: Animal[];

    constructor(private animalService: AnimalService, private confirmationDialogService: ConfirmationDialogService) { }

    ngOnInit() {
        this.getAllAnimals();
    }

    getAllAnimals() {
        this.animalService.findAll().subscribe(data => {
            console.log(data);
            this.animals = data;
        });
    }

    delete(animal) {
        //Delete item in Student data
        this.animalService.delete(animal.id).subscribe(Response => {
          this.getAllAnimals();
        });
    }

    public openConfirmationDialog(animalId) {
        this.confirmationDialogService.confirm('Confirmação', 'Confirma a exclusão?', animalId, 'animal')
        .then((confirmed) => console.log('User confirmed:', confirmed))
        .catch(() => console.log('User dismissed the dialog (e.g., by using ESC, clicking the cross icon, or clicking outside the dialog)'));
    }

}
