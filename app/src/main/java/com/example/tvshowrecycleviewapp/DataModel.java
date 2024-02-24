package com.example.tvshowrecycleviewapp;

public class DataModel {
    private String characterName;
    private String characterDescription;
    private int characterPic;
    private String longDescription;

    public DataModel(String characterName, String characterDescription, int characterPic,String longerDescription) {
        this.characterName = characterName;
        this.characterDescription = characterDescription;
        this.characterPic = characterPic;
        this.longDescription = longDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
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
