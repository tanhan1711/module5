import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {calculatorComponent} from "./calculator/calculator.component";
import { ColorComponent } from './color/color.component';

@NgModule({
  declarations: [
    AppComponent,
    calculatorComponent,
    ColorComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
