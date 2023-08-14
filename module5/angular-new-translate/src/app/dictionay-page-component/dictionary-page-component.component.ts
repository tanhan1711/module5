import { Component, OnInit } from '@angular/core';
import {IWord} from "../i-word";
import {DictionaryServiceService} from "../service/dictionary-service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-page-component',
  templateUrl: './dictionary-page-component.component.html',
  styleUrls: ['./dictionary-page-component.component.css']
})
export class DictionaryPageComponentComponent implements OnInit {
  words: IWord[]

  constructor(private dictionaryServiceService : DictionaryServiceService, private router: Router ) { }

  ngOnInit(): void {
    this.getAll();
  }

  search(value: string) {
    this.router.navigateByUrl('/detail/' + value).then(r => {
    });
  }

  private getAll() {
    this.words= this.dictionaryServiceService.words
  }
}
