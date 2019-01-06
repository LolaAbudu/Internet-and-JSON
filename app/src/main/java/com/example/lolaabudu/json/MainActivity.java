package com.example.lolaabudu.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //this is how you translate JSON that you get from the internet, into useful Java code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject jsonDog = new JSONObject();
        JSONArray dogTypes = new JSONArray();

        try{
            jsonDog.put("status", "sucess").put("message", jsonDog.put("affenpinscher", dogTypes).put("african", dogTypes).put("airedale",dogTypes).put("akita",dogTypes).put("appenzeller",dogTypes).put("basenji", dogTypes)
            );
            Log.d("JSONARRAY", "Card List Size" + jsonDog.toString());
        }catch (JSONException e){
           e.printStackTrace();
        }
















//        JSONObject pokerHand = new JSONObject();
//
//        JSONObject pokerCard = new JSONObject();
//
////        try{
////            pokerCard.put("rank", "Five")
////                    .put("suit", "Spades");
////            pokerHand.put("Cards", new JSONArray()
////                    .put(pokerCard))
////                    .put(new JSONObject()
////                    .put("rank", "ace")
////                    .put("suit", "Hearts"))
////            );
////        }catch (JSONException e){
////            e.printStackTrace();
////        }
//
//        //always put within a try catch when using JSON for Java
//        try {
//            pokerHand.put("hand", new JSONArray()
//                    .put(new JSONObject()   //puts a new object
//                            .put("rank", "Ace")   //puts the new key/value pair
//                            .put("suit", "CLUBS"))
//                    .put(new JSONObject()
//                            .put("rank", "King")
//                            .put("suit", "DIAMONDS"))
//                    .put(new JSONObject()
//                            .put("rank", "Queen")
//                            .put("suit", "HEARTS"))
//                    .put(new JSONObject()
//                            .put("rank", "Jack")
//                            .put("suit", "SPADES"))
//                    .put(new JSONObject()
//                            .put("rank", "Ten")
//                            .put("suit", "CLUBS"))
//            );
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        Log.d("JSON: ", "onCreate: " + pokerHand.toString());
//
//
//        //new JSONObject that stores a JSONArray of other JSONObjects
//        JSONObject bikeRack = new JSONObject();
//        try {
//            bikeRack.put("bikes", new JSONArray().put(new JSONObject().put("Color", "Red").put("Brand", "Nike")));
//        }catch(JSONException e){
//            e.printStackTrace();
//        }
//
//
//        //putting a string as a JSONObject
//        String jsonString = pokerHand.toString();
//        try {
//        JSONObject apiResponse = new JSONObject(jsonString);
//        JSONArray apiHand = apiResponse.getJSONArray("hand");
//        //this creats a list of cards to get it and display it
//        List<Card> cardList = new ArrayList<>();
//
//        for(int i = 0; i< apiHand.length(); i++){
//            String rank = apiHand.getJSONObject(i).getString("rank");
//            Suit suit = Suit.valueOf(apiHand.getJSONObject(i).getString("suit"));
//            Log.d("JSONArray" + i, "rank" + rank);
//            Log.d("JSONArray" + i, "rank" + suit);
//            Card card = new Card(rank, suit);
//            cardList.add(card);
//        }
//
//        Log.d("JSONARRAY", "Card List Size" + cardList.size());
//
//        for(Card card : cardList){
//            Log.d("POJO", "Class" + card.getClass().getSimpleName() + "\nSuit: " + card.getSuit() +
//                    "\nRank: " + card.getRank());
//        }
//        }catch(JSONException e){
//            e.printStackTrace();
//        }
//
//
//
//        PuppyResponse puppyResponse = new PuppyResponse();
//        List<String>urlList = new ArrayList<>();
//        try{
//            JSONObject jsonObject = new JSONObject(Hound.dogJson);
//            JSONArray jsonArray = jsonObject.getJSONArray("message");
//            Log.d("Hound", "URL: " + jsonArray.length());
//
//            for(int i = 0; i< jsonArray.length(); i++){
//                String url = jsonArray.getString(i);
//                urlList.add(url);
//            }
//
//        }catch(JSONException e){
//            e.printStackTrace();
//        }
//
//        puppyResponse.setStatus(jsonObject.getString("status"));
//        puppyResponse.setMessasge(urlList);
    }
}
