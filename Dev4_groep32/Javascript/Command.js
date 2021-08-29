
/* Deze code werd geschreven door Ashley Hart 
en gebaseerd op https://www.dofactory.com/javascript/design-patterns/command */

let totalText = document.getElementById("total");

//PURE FUNCTIONS
//add() en subtract() zouden pure functies zijn als ik geen console.log() deed om aan te tonen wat de functies net gedaan hebben.
function add(totalPrice, addingPrice) {
  totalText.innerText = `${addingPrice + totalPrice}`
  console.log(`You just added ${addingPrice}`);
  return addingPrice + totalPrice;
}

function subtract(totalPrice, subtractingPrice) {
  totalText.innerText = `${subtractingPrice - totalPrice}`
  console.log(`You just subtracted ${subtractingPrice}`);
  return totalPrice - subtractingPrice;
}



let Command = function (execute, undo, price) {
  this.execute = execute
  this.undo = undo;
  this.price = price;
}

//PURE FUNCTIONS
//AddCommand en SubCommand returnen gewoon elke keer een Command 
let AddCommand = function (price) {
  return new Command(
    add,
    subtract, price);
}

let SubCommand = function (price) {
  return new Command(
    subtract,
    add,
    price);
}


let CommandsController = function () {
  let currentValue = 0;
  let commands = [];

  return {
    execute: function (command) {
      currentValue = command.execute(currentValue, command.price);
      commands.push(command);
    },

    undo: function () {

      var command = commands.pop();
      currentValue = command.undo(currentValue, command.price);
    },
    //PURE FUNCTIONS
    //CommandsController.getCurrentValue returnt alleen currentValue
    getCurrentValue: function () {
      return currentValue;
    }
  }
}


let commandsController = new CommandsController();



//listening to click event of ADDING NUMBER
let elements = document.getElementsByClassName("add");

for (i = 0; i < elements.length; i++) {
  let innertext = elements[i].innerText;
  elements[i].addEventListener("click", () => {
    let parsedText = parseFloat(innertext)
    commandsController.execute(new AddCommand(parsedText));
    let value = commandsController.getCurrentValue();
    console.log(`Total is: ${value}`);
  });
}

//listening to click event of UNDOING ACTION
let undoElement = document.getElementById("undo");
if (undoElement) {
  undoElement.addEventListener("click", () => {
    commandsController.undo();
    let value = commandsController.getCurrentValue();
    console.log(`Total is: ${value}`)
  });
} else {
  console.log(undoElement);

}