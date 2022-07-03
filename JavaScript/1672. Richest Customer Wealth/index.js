var maximumWealth = function (accounts) {
	let richest = 0;
	accounts.forEach((accounts) => {
		const wealth = accounts.reduce(
			(previousValue, currentValue) => previousValue + currentValue
		);
		if (wealth > richest) {
			richest = wealth;
		}
	});
	console.log(richest);
};

accounts = [[1, 5], [7, 3], [3, 5]];
maximumWealth(accounts);
