//Quick sort algoritme
// Sorteren van bestellingen gebaseerd op hun totaalprijs

var totaalPrijs = [4.55, 7.55, 6.35, 8.35];
function swap(totaalPrijs, leftIndex, rightIndex){
    var temp = totaalPrijs[leftIndex];
    totaalPrijs[leftIndex] = totaalPrijs[rightIndex];
    totaalPrijs[rightIndex] = temp;
}
function partition(totaalPrijs, left, right){
    //Variabelen aanmaken voor middelste en uiterste elementen
    var pivot = totaalPrijs[Math.floor((right+left)/2)], i = left, j = right;
    while(i<=j){
        while(totaalPrijs[i] < pivot){
            i++;
        }
        while(totaalPrijs[j] > pivot){
            j--;
        }
        if(i<=j){
            //Omwisselen van de 2 elementen
            swap(totaalPrijs, i, j);
            i++;
            j--;
        }
    }
    return i;
}
function quickSort(totaalPrijs, left, right){
    var index;
    if(totaalPrijs.length > 1){
        //Return index van parition
        index = partition(totaalPrijs, left, right);
        if(left<index-1){
            quickSort(totaalPrijs, left, index-1);
        }
        if(index<right){
            quickSort(totaalPrijs, index, right);
        }
    }
    return totaalPrijs;
}

//Eerste aanroep van quick sort
var sortedArray = quickSort(totaalPrijs, 0, totaalPrijs.length-1);
//Print array in console
console.log("Sorted array: " + sortedArray);