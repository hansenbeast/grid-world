/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RockHoundRunner
{
    static final int ONE=1,TWO=2,THREE=3,FOUR=4,FIVE=5,SIX=6,SEVEN=7,EIGHT=8;
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(SEVEN, EIGHT), new Rock());
        world.add(new Location(THREE, THREE), new Rock());
        world.add(new Location(TWO, EIGHT), new Flower(Color.BLUE));
        world.add(new Location(FIVE, FIVE), new Flower(Color.PINK));
        world.add(new Location(ONE, FIVE), new Flower(Color.RED));
        world.add(new Location(SEVEN, TWO), new Flower(Color.YELLOW));
        world.add(new Location(FOUR, FOUR), new RockHound());
        world.add(new Location(FIVE, EIGHT), new RockHound());
        world.show();
    }
}