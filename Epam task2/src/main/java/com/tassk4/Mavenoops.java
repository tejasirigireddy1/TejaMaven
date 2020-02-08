package com.tassk4;
class Sweet implements Comparable{
int weight=1;
String name="";
String color="yellow";
float calories=100;
public int compareTo(Object o) {
return 0;
}
}
class chocolate extends Sweet{}
class Snickers extends chocolate
{
Snickers ()
{
this.name="Snickers";
}
}
class Munch extends chocolate{
Munch()
{
this.name="Munch";
}
}
public class Mavenoops {
public static void main(String[] args) {
Sweet[]  allsweets = new Sweet[3];
allsweets [0]= new Munch();
allsweets [1]= new Munch();
allsweets [2]= new Snickers();
float tw =0;
for (int i = 0; i < allsweets.length; i++) {
Sweet s = allsweets[i];
tw += s.weight;
}
System.out.println(" total-weight  = "+tw);
System.out.println(" Printing the chocloates ");
for (int i = 0; i < allsweets.length; i++) {
Sweet s = allsweets[i];
System.out.println(s.name);
}
System.out.println("chocolates sorted suceessfully");
}}
