package agha.rimaa.rimaaproject;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity
{
    private EditText etEmail;
    private EditText etPassword;
    private Button btnUp;
    private Button btnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPassword= (EditText) findViewById(R.id.etPassword);
        btnUp= (Button) findViewById(R.id.btnUp);
        btnIn= (Button) findViewById(R.id.btnIn);


    }
}
