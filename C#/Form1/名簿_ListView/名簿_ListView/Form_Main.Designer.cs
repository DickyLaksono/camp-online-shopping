namespace 名簿_ListView
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
            label1 = new Label();
            label_Name = new Label();
            label3 = new Label();
            label4 = new Label();
            radioButton_Male = new RadioButton();
            radioButton_Female = new RadioButton();
            textBox1 = new TextBox();
            textBox2 = new TextBox();
            button1 = new Button();
            button2 = new Button();
            listView_Display = new ListView();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(49, 59);
            label1.Name = "label1";
            label1.Size = new Size(41, 20);
            label1.TabIndex = 0;
            label1.Text = "性別";
            // 
            // label_Name
            // 
            label_Name.AutoSize = true;
            label_Name.Location = new Point(49, 157);
            label_Name.Name = "label_Name";
            label_Name.Size = new Size(41, 20);
            label_Name.TabIndex = 1;
            label_Name.Text = "氏名";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(158, 136);
            label3.Name = "label3";
            label3.Size = new Size(25, 20);
            label3.TabIndex = 2;
            label3.Text = "姓";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(158, 180);
            label4.Name = "label4";
            label4.Size = new Size(25, 20);
            label4.TabIndex = 3;
            label4.Text = "名";
            // 
            // radioButton_Male
            // 
            radioButton_Male.AutoSize = true;
            radioButton_Male.Checked = true;
            radioButton_Male.Location = new Point(158, 55);
            radioButton_Male.Name = "radioButton_Male";
            radioButton_Male.Size = new Size(62, 24);
            radioButton_Male.TabIndex = 4;
            radioButton_Male.TabStop = true;
            radioButton_Male.Text = "男性";
            radioButton_Male.UseVisualStyleBackColor = true;
            // 
            // radioButton_Female
            // 
            radioButton_Female.AutoSize = true;
            radioButton_Female.Location = new Point(158, 85);
            radioButton_Female.Name = "radioButton_Female";
            radioButton_Female.Size = new Size(62, 24);
            radioButton_Female.TabIndex = 5;
            radioButton_Female.Text = "女性";
            radioButton_Female.UseVisualStyleBackColor = true;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(234, 129);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(125, 27);
            textBox1.TabIndex = 6;
            // 
            // textBox2
            // 
            textBox2.Location = new Point(234, 173);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(125, 27);
            textBox2.TabIndex = 7;
            // 
            // button1
            // 
            button1.Location = new Point(458, 127);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 8;
            button1.Text = "登録";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(458, 171);
            button2.Name = "button2";
            button2.Size = new Size(94, 29);
            button2.TabIndex = 9;
            button2.Text = "削除";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // listView_Display
            // 
            listView_Display.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3 });
            listView_Display.FullRowSelect = true;
            listView_Display.GridLines = true;
            listView_Display.Location = new Point(49, 237);
            listView_Display.Name = "listView_Display";
            listView_Display.Size = new Size(503, 192);
            listView_Display.TabIndex = 10;
            listView_Display.UseCompatibleStateImageBehavior = false;
            listView_Display.View = View.Details;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "NO";
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "性別";
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "氏名";
            columnHeader3.Width = 180;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(listView_Display);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Controls.Add(radioButton_Female);
            Controls.Add(radioButton_Male);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label_Name);
            Controls.Add(label1);
            Name = "Form_Main";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label_Name;
        private Label label3;
        private Label label4;
        private RadioButton radioButton_Male;
        private RadioButton radioButton_Female;
        private TextBox textBox1;
        private TextBox textBox2;
        private Button button1;
        private Button button2;
        private ListView listView_Display;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
    }
}
