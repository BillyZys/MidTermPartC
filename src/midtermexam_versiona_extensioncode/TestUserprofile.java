/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Yunsheng
 */
public class TestUserprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userID = input.nextLine();

        System.out.println("Please choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int choice = input.nextInt();
        String selectedGenre = genres[choice - 1];

        UserProfile userProfile = new UserProfile(userID, selectedGenre);
        System.out.println("User profile created: " + userProfile.getUserID() + " - " + userProfile.getGenre());
    }
}
