var numberOfSteps = function (num) {
	let count = 0;
	while (num) {
		if (num % 2) {
			count++;
			num--;
		} else {
			count++;
			num = num / 2;
		}
	}
	return count;
};

console.log(numberOfSteps(8));