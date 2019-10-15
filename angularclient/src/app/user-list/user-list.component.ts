import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user.service';
import { ConfirmationDialogService } from '../confirmation-dialog-service/confirmation-dialog.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

    users: User[];

    constructor(private userService: UserService, private confirmationDialogService: ConfirmationDialogService) { }

    ngOnInit() {
        this.getAllUsers();
    }

    getAllUsers() {
        this.userService.findByPersonType(1).subscribe(data => {
            this.users = data;
        });
    }

    delete(user) {
        //Delete item in Student data
        this.userService.delete(user.id).subscribe(Response => {
          this.getAllUsers();
        });
    }
    public openConfirmationDialog(userId) {
        this.confirmationDialogService.confirm('Confirmação', 'Confirma a exclusão?', userId, 'user')
        .then((confirmed) => console.log('User confirmed:', confirmed))
        .catch(() => console.log('User dismissed the dialog (e.g., by using ESC, clicking the cross icon, or clicking outside the dialog)'));
      }

}
