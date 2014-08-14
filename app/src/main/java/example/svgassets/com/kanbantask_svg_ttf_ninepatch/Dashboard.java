package example.svgassets.com.kanbantask_svg_ttf_ninepatch;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;


public class Dashboard extends Activity {

    ImageView svgImageView;
    TextView textViewCustomFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // SVG Image build
        svgImageView = (ImageView) findViewById(R.id.svgimageview);
        SVG svg = SVGParser.getSVGFromResource(getResources(), R.raw.transformations);
        svgImageView.setImageDrawable(svg.createPictureDrawable());
        svgImageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);


        // Custom Font .ttf
        textViewCustomFont = (TextView) findViewById(R.id.textview_customfont);
        textViewCustomFont.setTextSize(16);
        textViewCustomFont.setText("*** Task Kanban team - Android ****");
        Typeface fontType = Typeface.createFromAsset(getAssets(), "diager.ttf");
        textViewCustomFont.setTypeface(fontType);

        // 9 patch image as a back ground
        textViewCustomFont.setBackgroundResource(R.drawable.buttonimg);
    }


}
