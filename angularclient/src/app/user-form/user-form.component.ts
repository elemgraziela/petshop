import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../service/user.service';
import { User } from '../model/user';
import { PersonType } from '../model/person-type';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: User;
  types: PersonType[];

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) {
    this.user = new User();
  }

  ngOnInit() {
    //this.getAllTypes();
  }

  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }

  /*getAllTypes() {
      this.userService.findAllTypes().subscribe(data => {
          this.types = data;
      });
  }*/

}
