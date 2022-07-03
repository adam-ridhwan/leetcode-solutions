var fizzBuzz = function (n) {
	let result = new Array(n);
	for (let i = 1; i < n + 1; i++) {
		if (i % 3 === 0 && i % 5 === 0) {
			result[i - 1] = "Fizz";
		} else if (i % 3 === 0) {
			result[i - 1] = "Fizz";
		} else if (i % 5 === 0) {
			result[i - 1] = "Buzz";
		} else {
			result[i - 1] = i.toString();
		}
	}
	console.log(result);
};

fizzBuzz(15);