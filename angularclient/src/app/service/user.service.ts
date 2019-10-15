import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { PersonType } from '../model/person-type';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class UserService {

    private usersUrl: string;
    private typeUrl: string;

    constructor(private http: HttpClient) {
        this.usersUrl = 'http://localhost:8080/people';
        this.typeUrl = 'http://localhost:8080/person-types';
    }

    public findAll(): Observable<User[]> {
        return this.http.get<User[]>(this.usersUrl);
    }

    public save(user: User) {
        user.personType = "1";
        return this.http.post<User>(this.usersUrl, user);
    }

    public delete(id: any) {
        return this.http.delete<User>(`${this.usersUrl  }/${id}`, { responseType: 'json' });
    }

    public findByPersonType(id: any) {
            return this.http.get<User[]>(`${this.usersUrl  }/search-by-person-type/${id}`, { responseType: 'json' });
        }

    /*public findAllTypes(): Observable<PersonType[]> {
        return this.http.get<PersonType[]>(this.typeUrl);
    }*/
}
