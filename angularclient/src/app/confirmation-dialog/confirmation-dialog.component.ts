import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

import { UserService } from '../service/user.service';
import { AnimalService } from '../animal-service/animal.service';

@Component({
  selector: 'app-confirmation-dialog',
  templateUrl: './confirmation-dialog.component.html',
  styleUrls: ['./confirmation-dialog.component.css']
})
export class ConfirmationDialogComponent implements OnInit {
    @Input() title: string;
    @Input() message: string;
    @Input() id: string;
    @Input() entity: string;
    @Input() btnOkText: string;
    @Input() btnCancelText: string;

  constructor(private activeModal: NgbActiveModal,
                private router: Router,
                private userService: UserService,
                private animalService: AnimalService) { }

    ngOnInit() {
    }

    public decline() {
        this.activeModal.close(false);
    }

    public accept(id, entity) {
        if(entity == 'user') {
            this.userService.delete(id).subscribe(Response => {
                this.activeModal.close(true);
                this.router.navigate(['/users']);
            });
        }
        if(entity == 'animal') {
            this.animalService.delete(id).subscribe(Response => {
                this.activeModal.close(true);
                this.router.navigate(['/animals']);
            });
        }
    }

    public dismiss() {
        this.activeModal.dismiss();
    }

}
