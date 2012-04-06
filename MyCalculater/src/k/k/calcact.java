package k.k;

import junit.framework.Protectable;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calcact extends Activity {
    /** Called when the activity is first created. */
	String x=null,y=null;
	char z='\0';
	Float c=new Float(0.0);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText e1=(EditText)findViewById(R.id.autoCompleteTextView1);
        final Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b1.getText());
				
			}
		});
        final Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b2.getText());
				
			}
		});
        final Button b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new OnClickListener() {
        	
			@Override
			public void onClick(View v) {
			e1.setText(e1.getText()+""+b3.getText());
				
			}
		});
		
        final Button b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b5.getText());
				
			}
		});
        final Button b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b6.getText());
				
			}
		});
        final Button b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b7.getText());
				
			}
		});
        
        final Button b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b9.getText());
				
			}
		});
        final Button b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b10.getText());
				
			}
		});
        final Button b11=(Button)findViewById(R.id.button11);
        b11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b11.getText());
				
			}
		});
        
        final Button b13=(Button)findViewById(R.id.button13);
        b13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b13.getText());
				
			}
		});
        final Button b14=(Button)findViewById(R.id.button14);
        b14.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(e1.getText()+""+b14.getText());
				
			}
		});
                Button b17=(Button)findViewById(R.id.button17);
        b17.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				e1.setText(null);
				x=null;
				y=null;
				
			}
		});
        
        final Button b4=(Button)findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				x=e1.getText().toString();
				e1.setText(null);
				z='a';
				}
		});
		final Button b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				x=e1.getText().toString();
				e1.setText(null);
				z='b';
			}
		});
        final Button b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				x=e1.getText().toString();
				e1.setText(null);
				z='c';
			}
		});
        final Button b15=(Button)findViewById(R.id.button15);
        b15.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				x=e1.getText().toString();
				e1.setText(null);
				z='d';

			}
		});
        final Button b16=(Button)findViewById(R.id.button16);
        b16.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				y=e1.getText().toString();
		        
				switch (z) {
						case 'a':
							c=Float.parseFloat(x)-Float.parseFloat(y);
							e1.setText(c+"");
							break;
						case 'b':
							c=Float.parseFloat(x)/Float.parseFloat(y);
							e1.setText(c+"");
							break;
						case 'c':
							c=Float.parseFloat(x)*Float.parseFloat(y);
							e1.setText(c+"");
							break;
						case 'd':
							c=Float.parseFloat(x)+Float.parseFloat(y);
							e1.setText(c+"");
							break;
						case 'e':
							e1.setText(null);
							e1.setText(c+"");
							break;
						default:
							Toast.makeText(calcact.this, "Enter operands", 10).show();

						}

			}
		});
        
        
	}

}