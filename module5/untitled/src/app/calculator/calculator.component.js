"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.CalculatorComponent = void 0;
// @ts-ignore
var core_1 = require("@angular/core");
var CalculatorComponent = /** @class */ (function () {
    function CalculatorComponent() {
        var _this = this;
        this.calculate = function (ope, value1, value2) {
            switch (ope) {
                case "+":
                    _this.result = Number(value1) + Number(value2);
                    break;
                case "-":
                    _this.result = Number(value1) - Number(value2);
                    break;
                case "*":
                    _this.result = Number(value1) * Number(value2);
                    break;
                case "/":
                    var val2 = Number(value2);
                    if (val2 != 0) {
                        _this.result = Number(value1) / val2;
                    }
                    else {
                        _this.result = "value2 not is 0";
                    }
                    break;
            }
        };
    }
    CalculatorComponent.prototype.ngOnInit = function () {
    };
    CalculatorComponent = __decorate([
        (0, core_1.Component)({
            selector: 'app-calculator',
            templateUrl: './calculator.component.html',
            styleUrls: ['./calculator.component.css']
        })
    ], CalculatorComponent);
    return CalculatorComponent;
}());
exports.CalculatorComponent = CalculatorComponent;
