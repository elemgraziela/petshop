import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { AnimalListComponent } from './animal-list/animal-list.component';
import { AnimalFormComponent } from './animal-form/animal-form.component';


const routes: Routes = [
    { path: 'users', component: UserListComponent },
    { path: 'add-user', component: UserFormComponent },
    { path: 'animals', component: AnimalListComponent },
    { path: 'add-animal', component: AnimalFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
