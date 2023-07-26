function Fibonacci(n: number): number {
    if (n <= 2) {
        return 1
    }
    return Fibonacci(n - 1) + Fibonacci(n - 2)
}

let array = [1, 5, 9, 2, 6, 15, 19, 35, 51, 53];
let sum = 0
for (let n in array) {
    sum += Fibonacci(Number(n))
}
console.log("Tổng của dãy số Fibonacci = " + String(sum))