# Overview

A Java console application implementing an OO model of a market store which provides its clients with 3 types of discount cards and generates invoices for their purchases.

## Structure
The application consists of:
#
  * package _**cardholders**_:
      #
      * class **CardHolder**:
        * data: **first name**, **last name**;
#
  * package _**cards**_:
     #
     * enum **CardType**:
       * has three options: **bronze**, **silver** and **gold**;
     #
     * abstract class **Card** - superclass of all cards:
       * data: **card type**, **cardholder**, **initial discount rate**, **turnover** for the previous month;
       * abstract method **currentRate** - calculates current discount rate depending on the turnover;
     #
     * class **BronzeCard** - subclass of Card, **currentRate** implements the following logic:
       * **initial** discount rate: **0 %**;
       * rate in case of turnover **between $100 and $300**: **1 %**;
       * rate in case of turnover **over $300**: **2.5 %**;
     #
     * class **SilverCard** - subclass of Card, **currentRate** implements the following logic:
       * **initial** discount rate: **2 %**;
       * rate in case of turnover **over $300**: **3.5 %**;
     #
     * class **GoldCard** - subclass of Card, **currentRate** implements the following logic:
       * **initial** discount rate: **2 %**;
       * rate **growing for each $100** from the turnover with **2.5 %**, **capping at 10 %**;
#
  * package _**paydesk**_:
     #
     * class **PayDesk**:
       * 3 private static methods for returning:
           * **current discount rate** of the card used (as calculated depending on the turnover);
           * **discount for the current purchase** (calculated by multiplying the current rate by the purchase value);
           * **total purchase value** (calculated by substracting the discount from the purchase value),
       * 1 public static method for returning **the invoice information** by using the above 3 methods;
     #
     * class **Invoice**:
       * data: **card type**, **purchase value**, **discount rate**, **discount**, **total**;
       * overriden **toString** method;
#
   * package _**main**_:
     #
     * class **Main**:
       * private **printString** method for outputting a string to the console;
       * public **main** method which demonstrates the application's functionalities for each of the three card types by: creating istances with sample data for cardholder and card, updating the card's turnover and printing an invoice with sample data.

## Starting the application
Compile the application and execute the Main.class file from the main package.
