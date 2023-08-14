import {Injectable} from '@angular/core';
import {IWord} from "../i-word";

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {
  words: IWord[] = [{
    id: 1,
    word: 'dog',
    mean: 'cho',
  },
    {
      id: 2,
      word: 'cat',
      mean: 'meo',
    },
    {
      id: 3,
      word: 'bird',
      mean: 'chim',
    },
    {
      id: 4,
      word: 'fish',
      mean: 'ca',
    },

  ]

  constructor() {
  }

  findAll() {
    return this.words;
  }

  find(word: string): any {
    return this.words.find(e => {
      return e.word == word;
    })

  }
}

