import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DictionaryServiceService} from "../service/dictionary-service.service";
import {IWord} from "../i-word";

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  result: IWord = {} as IWord;

  constructor(private dictionaryService: DictionaryServiceService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const word: any = paramMap.get('word');
      this.result = this.dictionaryService.find(word);
    });
  }

}
