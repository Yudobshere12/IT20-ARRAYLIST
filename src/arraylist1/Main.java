package arraylist1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ItemManager list = new ItemManager();

        //Initializing variables
        String item1, item2, item3, newItem, finditem;
        int index;

        //to display items first
        list.displayItems();

        //User input
        System.out.println("Enter 3 items you want to add: ");
        item1 = sc.nextLine();
        item2 = sc.nextLine();
        item3 = sc.nextLine();

        //inputs will be added to the arraylist
        list.addItems(item1, item2, item3);
        System.out.println("-----------------------------");

        //inputs to update one value
        System.out.println("Enter an index number that you want to change: ");
        index = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter a new item name that you want to change on that index number: ");
        newItem = sc.nextLine();

        list.updateItem(index, newItem);
        list.displayItems();
        System.out.println("-----------------------------");

        //To find the item of user's input and display the found item
        System.out.println("Enter an item name that you want to find: ");
        finditem = sc.nextLine();

        list.findItem(finditem);
        list.displayItems();
        System.out.println("-----------------------------");

        //To delete the item in the list by entering its index
        System.out.println("Enter an index number to delete: ");
        int newIndex = sc.nextInt();

        list.deleteItem(newIndex);
        list.displayItems();
        sc.close();

    }

}
