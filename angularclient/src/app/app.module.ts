import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { UserListComponent } from './user-list/user-list.component';
import { UserService } from './service/user.service';
import { UserFormComponent } from './user-form/user-form.component';
import { ConfirmationDialogComponent } from './confirmation-dialog/confirmation-dialog.component';
import { ConfirmationDialogService } from './confirmation-dialog-service/confirmation-dialog.service';
import { AnimalListComponent } from './animal-list/animal-list.component'
import { AnimalService } from './animal-service/animal.service';
import { AnimalFormComponent } from './animal-form/animal-form.component'
@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    ConfirmationDialogComponent,
    AnimalListComponent,
    AnimalFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [UserService, ConfirmationDialogService, AnimalService],
  bootstrap: [AppComponent],
  entryComponents: [ ConfirmationDialogComponent ]
})
export class AppModule { }
