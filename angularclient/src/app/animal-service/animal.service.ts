import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Animal } from '../model/animal';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AnimalService {

    private animalUrl: string;

    constructor(private http: HttpClient) {
        this.animalUrl = 'http://localhost:8080/animals';
    }

    public findAll(): Observable<Animal[]> {
        return this.http.get<Animal[]>(this.animalUrl);
    }

    public save(animal: Animal) {
        return this.http.post<Animal>(this.animalUrl, animal);
    }

    public delete(id: any) {
        return this.http.delete<Animal>(`${this.animalUrl  }/${id}`, { responseType: 'json' });
    }
}
