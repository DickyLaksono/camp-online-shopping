namespace 課題5
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
            groupBox1 = new GroupBox();
            groupBox2 = new GroupBox();
            adult = new RadioButton();
            child = new RadioButton();
            ikebukuro = new RadioButton();
            shibuya = new RadioButton();
            shinagawa = new RadioButton();
            tokyo = new RadioButton();
            ueno = new RadioButton();
            button_Display = new Button();
            groupBox1.SuspendLayout();
            groupBox2.SuspendLayout();
            SuspendLayout();
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(adult);
            groupBox1.Controls.Add(child);
            groupBox1.Location = new Point(66, 95);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(250, 194);
            groupBox1.TabIndex = 0;
            groupBox1.TabStop = false;
            groupBox1.Text = "大人・子供";
            // 
            // groupBox2
            // 
            groupBox2.Controls.Add(ueno);
            groupBox2.Controls.Add(ikebukuro);
            groupBox2.Controls.Add(tokyo);
            groupBox2.Controls.Add(shibuya);
            groupBox2.Controls.Add(shinagawa);
            groupBox2.Location = new Point(424, 95);
            groupBox2.Name = "groupBox2";
            groupBox2.Size = new Size(279, 194);
            groupBox2.TabIndex = 1;
            groupBox2.TabStop = false;
            groupBox2.Text = "行き先";
            // 
            // adult
            // 
            adult.AutoSize = true;
            adult.Location = new Point(6, 38);
            adult.Name = "adult";
            adult.Size = new Size(62, 24);
            adult.TabIndex = 2;
            adult.TabStop = true;
            adult.Text = "大人";
            adult.UseVisualStyleBackColor = true;
            // 
            // child
            // 
            child.AutoSize = true;
            child.Location = new Point(6, 79);
            child.Name = "child";
            child.Size = new Size(62, 24);
            child.TabIndex = 3;
            child.TabStop = true;
            child.Text = "子供";
            child.UseVisualStyleBackColor = true;
            // 
            // ikebukuro
            // 
            ikebukuro.AutoSize = true;
            ikebukuro.Location = new Point(6, 38);
            ikebukuro.Name = "ikebukuro";
            ikebukuro.Size = new Size(62, 24);
            ikebukuro.TabIndex = 4;
            ikebukuro.TabStop = true;
            ikebukuro.Text = "池袋";
            ikebukuro.UseVisualStyleBackColor = true;
            // 
            // shibuya
            // 
            shibuya.AutoSize = true;
            shibuya.Location = new Point(6, 79);
            shibuya.Name = "shibuya";
            shibuya.Size = new Size(62, 24);
            shibuya.TabIndex = 5;
            shibuya.TabStop = true;
            shibuya.Text = "渋谷";
            shibuya.UseVisualStyleBackColor = true;
            // 
            // shinagawa
            // 
            shinagawa.AutoSize = true;
            shinagawa.Location = new Point(6, 125);
            shinagawa.Name = "shinagawa";
            shinagawa.Size = new Size(62, 24);
            shinagawa.TabIndex = 6;
            shinagawa.TabStop = true;
            shinagawa.Text = "品川";
            shinagawa.UseVisualStyleBackColor = true;
            // 
            // tokyo
            // 
            tokyo.AutoSize = true;
            tokyo.Location = new Point(127, 38);
            tokyo.Name = "tokyo";
            tokyo.Size = new Size(62, 24);
            tokyo.TabIndex = 7;
            tokyo.TabStop = true;
            tokyo.Text = "東京";
            tokyo.UseVisualStyleBackColor = true;
            // 
            // ueno
            // 
            ueno.AutoSize = true;
            ueno.Location = new Point(129, 79);
            ueno.Name = "ueno";
            ueno.Size = new Size(62, 24);
            ueno.TabIndex = 8;
            ueno.TabStop = true;
            ueno.Text = "上野";
            ueno.UseVisualStyleBackColor = true;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(609, 339);
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
            Controls.Add(groupBox2);
            Controls.Add(groupBox1);
            Name = "Form_Main";
            Text = "Form1";
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            groupBox2.ResumeLayout(false);
            groupBox2.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private GroupBox groupBox1;
        private GroupBox groupBox2;
        private RadioButton adult;
        private RadioButton child;
        private RadioButton ikebukuro;
        private RadioButton shibuya;
        private RadioButton shinagawa;
        private RadioButton tokyo;
        private RadioButton ueno;
        private Button button_Display;
    }
}
