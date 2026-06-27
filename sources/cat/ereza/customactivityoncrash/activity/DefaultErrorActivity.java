package cat.ereza.customactivityoncrash.activity;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import cat.ereza.customactivityoncrash.config.CaocConfig;
import com.gmail.heagoo.apkeditor.gzd;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultErrorActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        setContentView(setResource("customactivityoncrash_default_error_activity", "layout"));
        Button button = (Button) findViewById(setResource("customactivityoncrash_error_activity_restart_button", gzd.COLUMN_ID));
        final CaocConfig configFromIntent = CustomActivityOnCrash.getConfigFromIntent(getIntent());
        if (configFromIntent == null) {
            finish();
            return;
        }
        if (configFromIntent.isShowRestartButton() && configFromIntent.getRestartActivityClass() != null) {
            button.setText(setResource("customactivityoncrash_error_activity_restart_app", "string"));
            button.setOnClickListener(new View.OnClickListener() { // from class: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m560xe26b1b8a(configFromIntent, view);
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m561xd5fa9fcb(configFromIntent, view);
                }
            });
        }
        TextView textView = (TextView) findViewById(setResource("customactivityoncrash_error_activity_more_info_button", gzd.COLUMN_ID));
        if (configFromIntent.isShowErrorDetails()) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m563xbd19a84d(view);
                }
            });
        } else {
            textView.setVisibility(8);
        }
        configFromIntent.getErrorDrawable();
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$cat-ereza-customactivityoncrash-activity-DefaultErrorActivity */
    public /* synthetic */ void m560xe26b1b8a(CaocConfig caocConfig, View view) {
        CustomActivityOnCrash.restartApplication(this, caocConfig);
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$cat-ereza-customactivityoncrash-activity-DefaultErrorActivity */
    public /* synthetic */ void m561xd5fa9fcb(CaocConfig caocConfig, View view) {
        CustomActivityOnCrash.closeApplication(this, caocConfig);
    }

    /* JADX INFO: renamed from: lambda$onCreate$3$cat-ereza-customactivityoncrash-activity-DefaultErrorActivity */
    public /* synthetic */ void m563xbd19a84d(View view) {
        TextView textView = (TextView) new AlertDialog.Builder(this).setTitle(setResource("customactivityoncrash_error_activity_error_details_title", "string")).setMessage(CustomActivityOnCrash.getAllErrorDetailsFromIntent(this, getIntent())).setPositiveButton(setResource("customactivityoncrash_error_activity_error_details_close", "string"), (DialogInterface.OnClickListener) null).setNeutralButton(setResource("customactivityoncrash_error_activity_error_details_copy", "string"), new DialogInterface.OnClickListener() { // from class: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m562xc98a240c(dialogInterface, i);
            }
        }).show().findViewById(R.id.message);
        if (textView != null) {
            textView.setTextSize(0, getResources().getDimension(setResource("customactivityoncrash_error_activity_error_details_text_size", "dimen")));
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$2$cat-ereza-customactivityoncrash-activity-DefaultErrorActivity */
    public /* synthetic */ void m562xc98a240c(DialogInterface dialogInterface, int i) {
        copyErrorToClipboard();
    }

    private void copyErrorToClipboard() {
        String allErrorDetailsFromIntent = CustomActivityOnCrash.getAllErrorDetailsFromIntent(this, getIntent());
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(getString(setResource("customactivityoncrash_error_activity_error_details_clipboard_label", "string")), allErrorDetailsFromIntent));
            Toast.makeText(this, setResource("customactivityoncrash_error_activity_error_details_copied", "string"), 0).show();
        }
    }

    public int setResource(String str, String str2) {
        return getResources().getIdentifier(str, str2, getPackageName());
    }
}
