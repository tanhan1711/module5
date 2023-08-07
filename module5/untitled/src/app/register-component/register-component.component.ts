import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, Validator, Validators} from '@angular/forms';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  registrationForm: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.registrationForm = new FormGroup({
      email: new FormControl('', [Validators.required]),
       password: new FormControl('', [Validators.required, Validators.minLength(6)]),
       confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
      country: new FormControl( '', [Validators.required]),
      age: new FormControl('', [Validators.required, this.checkAge]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')])
    });
  }

  submitForm() {
    if (this.registrationForm.valid) {
      console.log('User registered:', this.registrationForm.value);
    }
  }
  checkAge(control: AbstractControl): ValidationErrors | null{
     const age = +control.value;
     if (age < 18) {
       return {
         invalidAge: true};
     }
     return null ;
  }
}
