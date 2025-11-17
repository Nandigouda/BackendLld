package Milestone;

public class Member extends User{
private int borrowedBooksCount;
final  int  Max_Borrow_limit=5;

    public static void main(String[] args) {




    }



    @Override
    void displayDashboard() {

    }

    @Override
    boolean canBorrowBooks() {

        if (borrowedBooksCount < Max_Borrow_limit) {
            return true;

        }

return true;
}}
