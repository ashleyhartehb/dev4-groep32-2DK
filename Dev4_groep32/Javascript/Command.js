/*
we basically only have impure code because our application mostly relies on data from the user 
and each command shares that data globally so we have alot of side effects 
*/

//code by Ashley Hart

/* Code gebaseerd op https://www.dofactory.com/javascript/design-patterns/command */
let totalText = document.getElementById("total");
//let total = 
function add(totalPrice,addingPrice){
  totalText.innerText = `${addingPrice + totalPrice}`
  console.log(`You just added ${addingPrice}`);
  return addingPrice + totalPrice;
}

function subtract(totalPrice,subtractingPrice) {
  totalText.innerText = `${subtractingPrice - totalPrice}`
  console.log(`You just subtracted ${subtractingPrice}`);
  return totalPrice - subtractingPrice;
}



let Command = function (execute, undo,price) {
  this.execute = execute
  this.undo = undo;
  this.price = price;
}

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

  function action(command) {
    var name = command.execute.toString().substr(9, 3);
    return name.charAt(0).toUpperCase() + name.slice(1);
}
  return {
    execute: function (command) {
      //console.log(command);
      //console.log("List of commands:");
      //console.log(commands);

      currentValue = command.execute(currentValue, command.price);
      commands.push(command);
      //console.log(action(command) + ": " + command.price);
    },

    undo: function () {
      //console.log(command);
      //console.log("List of commands:");
      //console.log(commands);

      var command = commands.pop();
      currentValue = command.undo(currentValue, command.price);
      //console.log("Undo " + action(command) + ": " + command.price);
    },
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
    //console.log(parsedText);
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