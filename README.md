# dev4-groep32-2DK

Het onderwerp werd veranderd en we hebben dus gekozen om een soort van UberEats/Takeaway applicatie te maken. De gebruiker zou een bepaalde bestelling kunnen maken van het eten dat deze zou willen eten (Food). De bestelling zal dan opgeteld worden met de prijzen van elk soort eten en de extra’s die daarbij horen (Command/Calculate). Dan kan de gebruiker zien welke DeliveryGuy zijn bestelling komt leveren en ook de status van de levering.


## Michalis

Strategy(java):

	BikeDeliveryGuy,
	DeliveryGuy,
	DriveBehavior,
	DriveReckless,
	DriveWithCaution,
	DriveWithoutDelivery,
	OnRouteToCollectDelivery,
		DeliveryTest

Decorator(java):

	Food,
	Meat,
	Sauce,
	ToppingSelection,
	TypeofFood,
	Vegetables,
		FoodTest

Algoritme (js):

	QuickSort Algoritme

## Ashley

Command (java en js):

	Command,
	Calculate,
	AddCommand,
	SubtractCommand,
	CommandsController,
		CommandTest 


### Pure functions in Command.js:

    add() en subtract() zouden pure functies zijn als ik geen console.log() deed om aan te tonen wat de functies net gedaan hebben.
    AddCommand en SubCommand returnen gewoon elke keer een Command 
    CommandsController.getCurrentValue returnt alleen currentValue
