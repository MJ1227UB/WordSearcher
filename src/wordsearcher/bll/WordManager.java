/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.bll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mathias
 */
public class WordManager
{

    public List<String> getAllWords()
    {
        ArrayList<String> twoWords = new ArrayList<>();
        twoWords.add("One");
        twoWords.add("Two");
        
        return twoWords;
    }
    
}
