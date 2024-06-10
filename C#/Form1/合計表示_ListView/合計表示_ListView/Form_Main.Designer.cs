namespace 合計表示_ListView
{
    partial class Form_Main
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            listView_Display = new ListView();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            columnHeader4 = new ColumnHeader();
            openFileDialog = new OpenFileDialog();
            button_Display = new Button();
            SuspendLayout();
            // 
            // listView_Display
            // 
            listView_Display.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3, columnHeader4 });
            listView_Display.FullRowSelect = true;
            listView_Display.GridLines = true;
            listView_Display.Location = new Point(12, 58);
            listView_Display.Name = "listView_Display";
            listView_Display.Size = new Size(776, 312);
            listView_Display.TabIndex = 1;
            listView_Display.UseCompatibleStateImageBehavior = false;
            listView_Display.View = View.Details;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "商品名";
            columnHeader1.Width = 170;
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "単価";
            columnHeader2.Width = 100;
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "個数";
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "合計";
            columnHeader4.Width = 100;
            // 
            // openFileDialog
            // 
            openFileDialog.FileOk += openFileDialog_FileOk;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(12, 12);
            button_Display.Name = "button_Display";
            button_Display.Size = new Size(94, 29);
            button_Display.TabIndex = 2;
            button_Display.Text = "表示";
            button_Display.UseVisualStyleBackColor = true;
            button_Display.Click += button_Display_Click;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Display);
            Controls.Add(listView_Display);
            Name = "Form_Main";
            Text = "Form1";
            ResumeLayout(false);
        }

        #endregion

        private ListView listView_Display;
        private OpenFileDialog openFileDialog;
        private Button button_Display;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
        private ColumnHeader columnHeader4;
    }
}
