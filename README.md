# EditTextControl
public class MainActivity extends AppCompatActivity implements TextWatcher {


    TextView tv;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        Typeface font = Typeface.createFromAsset(getAssets(), "ubuntu.ttf");
        tv.setTypeface(font);


        ed = (EditText) findViewById(R.id.editText);
        ed.addTextChangedListener(this);


    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        try{

            int girilenSayi =Integer.parseInt(editable.toString());

            if(girilenSayi>100){
                editable.replace(0, editable.length(), "100");
            }

        }catch (NumberFormatException e){}
    }
}
