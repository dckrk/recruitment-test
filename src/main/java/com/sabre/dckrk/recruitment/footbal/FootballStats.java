/* Copyright 2021 Sabre Holdings */
package com.sabre.dckrk.recruitment.footbal;

import com.sabre.dckrk.recruitment.footbal.player.Player;

import java.util.List;

public interface FootballStats
{
   Double calculateDistanceCovered(List<Player> players);
}
