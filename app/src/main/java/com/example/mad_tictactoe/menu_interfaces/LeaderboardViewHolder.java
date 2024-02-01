package com.example.mad_tictactoe.menu_interfaces;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mad_tictactoe.R;

/*  Code by Zu Xiang Yek (20905457)
    Description:    ViewHolder for list items in the leaderboard.   */

public class LeaderboardViewHolder extends RecyclerView.ViewHolder {
    public ImageView profileImage;
    public TextView userName, winRate, countWin, countLose, countDraw, countAll;

    public LeaderboardViewHolder(@NonNull View itemView)
    {
        super(itemView); // Get view
        profileImage = itemView.findViewById(R.id.leaderboardItemImage); // Assign them to variables
        userName = itemView.findViewById((R.id.textUsername));
        winRate = itemView.findViewById(R.id.textWinRatePercent);
        countWin = itemView.findViewById(R.id.textWins);
        countLose = itemView.findViewById(R.id.textLosses);
        countDraw = itemView.findViewById(R.id.textDraws);
        countAll = itemView.findViewById(R.id.textTotal);
    }

}
