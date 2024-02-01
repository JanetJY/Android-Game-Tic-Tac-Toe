package com.example.mad_tictactoe.menu_interfaces;

import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mad_tictactoe.R;
import com.example.mad_tictactoe.User;

import java.util.ArrayList;

/*  Code by Zu Xiang Yek (20905457)
    Description:    Adapter for list items in the leaderboard. Sets data.   */

public class LeaderboardAdapter extends RecyclerView.Adapter<LeaderboardViewHolder> {
    ArrayList<User> userData;

    public LeaderboardAdapter(ArrayList<User> pUserList)
    {
        this.userData = pUserList;
    }

    @NonNull
    @Override
    public LeaderboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.leaderboard_item_layout, parent, false);
        LeaderboardViewHolder theViewHolder = new LeaderboardViewHolder(view);

        return theViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderboardViewHolder holder, int position) {
        User theUser = userData.get(position); // Get each user's information
        holder.profileImage.setImageResource(theUser.getResourceId()); // Set user profile image as profileImage view from ViewHolder
        holder.userName.setText(theUser.getName()); // Set other data as textViews
        holder.winRate.setText(String.format("%.0f",(theUser.getGameStat()).getWinRate()) + "%"); // Formats winRate as a percentage with 0 decimal points
        holder.countWin.setText("Wins: " + (theUser.getGameStat()).getWins());
        holder.countLose.setText("Losses: " + (theUser.getGameStat()).getLoses());
        holder.countDraw.setText("Draws: " + (theUser.getGameStat()).getDraws());
        holder.countAll.setText("Total Games: " + (theUser.getGameStat()).getTotalGames());
    }

    @Override
    public int getItemCount() {
        return userData.size();
    }
}
