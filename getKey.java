
//Using  greenfoot.getKey() from the greenfoot API
String key = greenfoot.getKey();

If (key != null){
    if (key.equals("left")){
        turn (-5);
    }
    if (key.equals("right")){
        turn (5);
    }
}

//Using  greenfoot.isKeyDown() from the greenfoot API

greenfoot.isKeyDown("left"){
    turn(-5);
}

greenfoot.isKeyDown("right"){
    turn(5);
}