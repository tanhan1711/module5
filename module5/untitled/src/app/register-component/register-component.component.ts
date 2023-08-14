import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, Validator, Validators} from '@angular/forms';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {

  constructor() {
  }

  registrationForm: FormGroup;

  confirmPassword(control: AbstractControl): ValidationErrors | null {
    const password: string = control.get('password').value;
    const confirmPassword: string = control.get('confirmPassword').value;
    if (password !== confirmPassword) {
      control.get('confirmPassword').setErrors({ passwordMismatch: true });
    } else {
      return null;
    }
  }

  ngOnInit(): void {

    this.registrationForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      confirm: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)])}
        , { validators: this.confirmPassword}),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')])
    });
  }

  submitForm() {
    console.log(this.registrationForm);
    }
}
