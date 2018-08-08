package hellocucumber;

class Resources {
    static String isItFriday(String today) {
      if(today.equals("Friday")){
        return "TGIF";
      }
        return "Nope";
    }
}

