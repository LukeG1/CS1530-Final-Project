package com.example;

public class Budget {
    
    private String name;
    private double budgetAmount;
    private double budgetSpent;
    private double budgetLeft;

    public Budget(String name, double budgetAmount, double budgetSpent){
        this.name = name;
        this.budgetAmount = budgetAmount;
        this.budgetSpent = budgetSpent;
        this.budgetLeft = (budgetAmount - budgetSpent);
    }

    public void updateName(String name){
        this.name = name;
    }

    public void updateBudgetAmount(double budgetAmount){
        this.budgetAmount = budgetAmount;
        this.calculateBudgetLeft();
    }

    public void updateBudgetSpent(double budgetSpent){
        this.budgetSpent = budgetSpent;
        this.calculateBudgetLeft();
    }
    
    public void calculateBudgetLeft(){
        this.budgetLeft = (this.budgetAmount - this.budgetSpent);
    }

}
