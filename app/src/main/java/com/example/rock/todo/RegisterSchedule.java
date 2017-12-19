package com.example.rock.todo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegisterSchedule extends DialogFragment{

    public interface OnCompleteListener{
        void onInputedData(String title, String contents, String label, String year, String month, String day);
    }

    private OnCompleteListener mCallback;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mCallback = (OnCompleteListener) activity;
        }
        catch (ClassCastException e) {
            Log.d("DialogFragmentExample", "Activity doesn't implement the OnCompleteListener interface");
        }
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.register_schedule, null);
        builder.setView(view);
        final Button submit = (Button) view.findViewById(R.id.buttonSubmit);
        final EditText title = (EditText) view.findViewById(R.id.edittextTitle);
        final EditText contents = (EditText) view.findViewById(R.id.edittextContents);
        final EditText label = (EditText) view.findViewById(R.id.edittextLabel);
        final EditText year = (EditText) view.findViewById(R.id.edittextYear);
        final EditText month = (EditText) view.findViewById(R.id.edittextMonth);
        final EditText day = (EditText) view.findViewById(R.id.edittextDay);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String strTitle = title.getText().toString();
                String strContents = contents.getText().toString();
                String strLabel = label.getText().toString();
                String strYear = year.getText().toString();
                String strMonth = month.getText().toString();
                String strDay = day.getText().toString();
                dismiss();
                mCallback.onInputedData(strTitle, strContents, strLabel, strYear, strMonth, strDay);
            }
        });

        return builder.create();
    }
}
