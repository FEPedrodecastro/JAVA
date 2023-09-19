package ex_02;

import ex_01.Pessoa;

public class Cao {

    private String name;
    private String race;
    private String barkSound = "au au au";

    public Cao(String name, String race) {
        this.name = name;
        this.race = race;

    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

  public String getBarkSound(){
        return barkSound;
  }

    public void setBarkSound(String barkSound) {
        this.barkSound = barkSound;
    }
}

