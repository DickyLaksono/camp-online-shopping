namespace おみくじ２
{
    partial class Form_main
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
            textBox1 = new TextBox();
            button_Display = new Button();
            name = new Label();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Location = new Point(449, 122);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(125, 27);
            textBox1.TabIndex = 0;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(449, 254);
            button_Display.Name = "button_Display";
            button_Display.Size = new Size(94, 29);
            button_Display.TabIndex = 1;
            button_Display.Text = "おみくじを引く";
            button_Display.UseVisualStyleBackColor = true;
            button_Display.Click += button_Display_Click;
            // 
            // name
            // 
            name.AutoSize = true;
            name.Location = new Point(115, 129);
            name.Name = "name";
            name.Size = new Size(142, 20);
            name.TabIndex = 2;
            name.Text = "名前を入力しください";
            // 
            // Form_main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(name);
            Controls.Add(button_Display);
            Controls.Add(textBox1);
            Name = "Form_main";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private Button button_Display;
        private Label name;
    }
}
