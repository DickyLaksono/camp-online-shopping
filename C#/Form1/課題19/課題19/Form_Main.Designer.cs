namespace 課題19
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
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            label5 = new Label();
            label6 = new Label();
            textBox1 = new TextBox();
            textBox2 = new TextBox();
            comboBox1 = new ComboBox();
            button1 = new Button();
            button_Quit = new Button();
            button_Reset = new Button();
            button_Start = new Button();
            label7 = new Label();
            label8 = new Label();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(32, 38);
            label1.Name = "label1";
            label1.Size = new Size(57, 20);
            label1.TabIndex = 0;
            label1.Text = "所持金";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(32, 89);
            label2.Name = "label2";
            label2.Size = new Size(168, 20);
            label2.TabIndex = 1;
            label2.Text = "賭け金を入力してください";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(32, 144);
            label3.Name = "label3";
            label3.Size = new Size(200, 20);
            label3.TabIndex = 2;
            label3.Text = "奇数か偶数を選択してください";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(32, 193);
            label4.Name = "label4";
            label4.Size = new Size(153, 20);
            label4.TabIndex = 3;
            label4.Text = "サイコロを振ってください";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(32, 284);
            label5.Name = "label5";
            label5.Size = new Size(124, 20);
            label5.TabIndex = 4;
            label5.Text = "サイコロの目は・・・";
            // 
            // label6
            // 
            label6.BorderStyle = BorderStyle.Fixed3D;
            label6.Font = new Font("MS UI Gothic", 24F, FontStyle.Regular, GraphicsUnit.Point, 0);
            label6.Location = new Point(404, 235);
            label6.Name = "label6";
            label6.Size = new Size(288, 124);
            label6.TabIndex = 5;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(404, 38);
            textBox1.Name = "textBox1";
            textBox1.ReadOnly = true;
            textBox1.Size = new Size(206, 27);
            textBox1.TabIndex = 6;
            // 
            // textBox2
            // 
            textBox2.Enabled = false;
            textBox2.Location = new Point(404, 82);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(206, 27);
            textBox2.TabIndex = 7;
            // 
            // comboBox1
            // 
            comboBox1.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBox1.Enabled = false;
            comboBox1.FormattingEnabled = true;
            comboBox1.Items.AddRange(new object[] { "奇数", "偶数" });
            comboBox1.Location = new Point(404, 136);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(98, 28);
            comboBox1.TabIndex = 8;
            // 
            // button1
            // 
            button1.Enabled = false;
            button1.Location = new Point(404, 184);
            button1.Name = "button1";
            button1.Size = new Size(153, 29);
            button1.TabIndex = 9;
            button1.Text = "サイコロを振る";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button_Quit
            // 
            button_Quit.Location = new Point(553, 376);
            button_Quit.Name = "button_Quit";
            button_Quit.Size = new Size(139, 29);
            button_Quit.TabIndex = 10;
            button_Quit.Text = "終了";
            button_Quit.UseVisualStyleBackColor = true;
            // 
            // button_Reset
            // 
            button_Reset.Enabled = false;
            button_Reset.Location = new Point(336, 376);
            button_Reset.Name = "button_Reset";
            button_Reset.Size = new Size(140, 29);
            button_Reset.TabIndex = 11;
            button_Reset.Text = "リセット";
            button_Reset.UseVisualStyleBackColor = true;
            // 
            // button_Start
            // 
            button_Start.Location = new Point(112, 376);
            button_Start.Name = "button_Start";
            button_Start.Size = new Size(146, 29);
            button_Start.TabIndex = 12;
            button_Start.Text = "ゲーム開始";
            button_Start.UseVisualStyleBackColor = true;
            button_Start.Click += button_Start_Click;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(642, 38);
            label7.Name = "label7";
            label7.Size = new Size(25, 20);
            label7.TabIndex = 13;
            label7.Text = "円";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(642, 85);
            label8.Name = "label8";
            label8.Size = new Size(25, 20);
            label8.TabIndex = 14;
            label8.Text = "円";
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(button_Start);
            Controls.Add(button_Reset);
            Controls.Add(button_Quit);
            Controls.Add(button1);
            Controls.Add(comboBox1);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Controls.Add(label6);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form_Main";
            Text = "Form1";
            Load += Form_Main_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Label label5;
        private Label label6;
        private TextBox textBox1;
        private TextBox textBox2;
        private ComboBox comboBox1;
        private Button button1;
        private Button button_Quit;
        private Button button_Reset;
        private Button button_Start;
        private Label label7;
        private Label label8;
    }
}
