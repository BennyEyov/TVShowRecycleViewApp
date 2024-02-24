    package com.example.tvshowrecycleviewapp;

    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;

    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        ArrayList<DataModel> dataSet;
        public CustomAdapter(ArrayList<DataModel> dataSet) {
            this.dataSet = dataSet;
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView characterName;
            TextView characterDescription;
            ImageView characterPic;
            ArrayList<DataModel> dataSet;
            public MyViewHolder(View itemView, ArrayList<DataModel> dataSet){
                super(itemView);
                this.dataSet = dataSet;

                characterName = itemView.findViewById(R.id.characterName);
                characterDescription = itemView.findViewById(R.id.characterDescription);
                characterPic = itemView.findViewById(R.id.characterPic);

                // Adding a click listener
                itemView.setOnClickListener(this);

            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    DataModel clickedItem = dataSet.get(position);
                    String message = clickedItem.getCharacterDescription();
                    Toast.makeText(v.getContext(), message, Toast.LENGTH_LONG).show();
                }
            }
        }



        @NonNull
        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);

            MyViewHolder myViewHolder = new MyViewHolder(view,dataSet);

            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
            TextView characterName = holder.characterName;
            TextView characterDescription = holder.characterDescription;
            ImageView characterPic = holder.characterPic;

            characterName.setText(dataSet.get(position).getCharacterName());
            characterDescription.setText(dataSet.get(position).getCharacterDescription());
            characterPic.setImageResource(dataSet.get(position).getCharacterPic());
        }

        @Override
        public int getItemCount() {
            return dataSet.size();
        }
    }
