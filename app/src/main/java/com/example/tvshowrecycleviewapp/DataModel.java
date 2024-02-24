package com.example.tvshowrecycleviewapp;

public class DataModel {
    private String characterName;
    private String characterDescription;
    private int characterPic;
    private String longerDescription;

    public DataModel(String characterName, String characterDescription, int characterPic,String longerDescription) {
        this.characterName = characterName;
        this.characterDescription = characterDescription;
        this.characterPic = characterPic;
        this.longerDescription = longerDescription;
    }

    public String getLongerDescription() {
        return longerDescription;
    }

    public void setLongerDescription(String longDescription) {
        this.longerDescription = longDescription;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public int getCharacterPic() {
        return characterPic;
    }

    public void setCharacterPic(int characterPic) {
        this.characterPic = characterPic;
    }
}
