package com.example.codeweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int arr[] = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sortingNums();

        permutations("frog");

        printDuplicates();

    }


    public void sortingNums() {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++)
            Log.v("TAG", String.valueOf(arr[i]));

    }

    public void permutations(String str) {

        StringBuilder sb = new StringBuilder();

        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }


        int end = ch.length;


//            while( < end){
//                sb.append(ch[end]);
//                Log.v("TAG", String.valueOf(sb));
//
//                end--;
//            }


    }

    public class data{

        private int x;
        private int y;
        private char ch;

        data(){
            this.x = x;
            this.y = y;
            this.ch = ch;
        }

    }


    private void printDuplicates() {

        //will return {0,0 | 0,1 | 2,1 | , 2,2 }

        ArrayList<String> dup = new ArrayList<>();
        char[][] ch = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'a', 'b'}};
        //   int[][] cordinates = new int[ch.length][ch.length];


        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {


                dup.add((ch[i][j] + " \t" + i + " " + j + " \t"));


            }
            System.out.println();
        }


        for(int i =0; i < dup.size(); i++){
            for(int j =0; j < dup.size(); j++){
                if(dup.get(i).charAt(0) == dup.get(j).charAt(0))
                    System.out.println(dup.get(i) + " " + dup.get(j));

            }


        }


    }
}
