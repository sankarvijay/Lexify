package parisnanterre.fr.lexify.database;

import java.io.Serializable;

import de.hdodenhof.circleimageview.CircleImageView;

public class User implements Serializable {

    int _id;
    String _pseudo;
    String _email;
    String[] _friendCode;
    //String _pass;
    String description;
    String avatar;
    String name;
    String mobile;
    String gender;
    int age;
    int _gamesPlayed;
    int _gamesFailed;
    int _wordGuessed;


    public User() {

    }


    /*public User(String _pseudo, String _email, String _pass) {
        this._pseudo = _pseudo;
        this._email = _email;
        //this._pass = _pass;
        this._wordGuessed = 0;
        this._gamesFailed = 0;
        this._gamesPlayed = 0;
    }*/

    public User(String _pseudo, String _email, String[] _friendCode){
        this._pseudo = _pseudo;
        this._email = _email;
        this._friendCode = _friendCode.clone();
    }

    public String get_pseudo() {
        return _pseudo;
    }

    public void set_pseudo(String _pseudo) {
        this._pseudo = _pseudo;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    /*
    public String get_pass() {
        return _pass;
    }

    public void set_pass(String _pass) {
        this._pass = _pass;
    }*/

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_gamesPlayed() {
        return _gamesPlayed;
    }

    public void update_gamesPlayed() {
        this._gamesPlayed += 1;
    }

    public int get_gamesFailed() {
        return _gamesFailed;
    }

    public void update_gamesFailed() {
        this._gamesFailed += 1;
    }

    //only used when the "abandon" button is pressed normally at the end of the computer game
    public void fix_gamesFailed() {
        this._gamesFailed -= 1;
    }

    public int get_wordGuessed() {
        return _wordGuessed;
    }

    public void update_wordGuessed() {
        this._wordGuessed += 1;
    }

    public void initializeStats(){
        this._gamesPlayed = 0;
        this._gamesFailed = 0;
        this._wordGuessed = 0;
    }

    public String[] get_friendCode() {
        return _friendCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
