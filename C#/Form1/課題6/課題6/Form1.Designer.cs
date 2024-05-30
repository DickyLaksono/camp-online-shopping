namespace 課題6
{
    partial class Form1
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
            textBox2 = new TextBox();
            plus = new RadioButton();
            mines = new RadioButton();
            multiple = new RadioButton();
            divide = new RadioButton();
            textBox3 = new TextBox();
            equal = new Label();
            calculate = new Button();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Location = new Point(61, 156);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(125, 27);
            textBox1.TabIndex = 0;
            // 
            // textBox2
            // 
            textBox2.Location = new Point(398, 156);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(125, 27);
            textBox2.TabIndex = 1;
            // 
            // plus
            // 
            plus.AutoSize = true;
            plus.Location = new Point(260, 68);
            plus.Name = "plus";
            plus.Size = new Size(40, 24);
            plus.TabIndex = 2;
            plus.TabStop = true;
            plus.Text = "+";
            plus.UseVisualStyleBackColor = true;
            // 
            // mines
            // 
            mines.AutoSize = true;
            mines.Location = new Point(260, 126);
            mines.Name = "mines";
            mines.Size = new Size(36, 24);
            mines.TabIndex = 3;
            mines.TabStop = true;
            mines.Text = "-";
            mines.UseVisualStyleBackColor = true;
            // 
            // multiple
            // 
            multiple.AutoSize = true;
            multiple.Location = new Point(260, 183);
            multiple.Name = "multiple";
            multiple.Size = new Size(36, 24);
            multiple.TabIndex = 4;
            multiple.TabStop = true;
            multiple.Text = "*";
            multiple.UseVisualStyleBackColor = true;
            // 
            // divide
            // 
            divide.AutoSize = true;
            divide.Location = new Point(260, 251);
            divide.Name = "divide";
            divide.Size = new Size(36, 24);
            divide.TabIndex = 5;
            divide.TabStop = true;
            divide.Text = "/";
            divide.UseVisualStyleBackColor = true;
            // 
            // textBox3
            // 
            textBox3.Location = new Point(634, 156);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(125, 27);
            textBox3.TabIndex = 6;
            // 
            // equal
            // 
            equal.AutoSize = true;
            equal.Location = new Point(565, 159);
            equal.Name = "equal";
            equal.Size = new Size(19, 20);
            equal.TabIndex = 7;
            equal.Text = "=";
            // 
            // calculate
            // 
            calculate.Location = new Point(665, 286);
            calculate.Name = "calculate";
            calculate.Size = new Size(94, 29);
            calculate.TabIndex = 8;
            calculate.Text = "計算";
            calculate.UseVisualStyleBackColor = true;
            calculate.Click += calculate_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(calculate);
            Controls.Add(equal);
            Controls.Add(textBox3);
            Controls.Add(divide);
            Controls.Add(multiple);
            Controls.Add(mines);
            Controls.Add(plus);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private TextBox textBox2;
        private RadioButton plus;
        private RadioButton mines;
        private RadioButton multiple;
        private RadioButton divide;
        private TextBox textBox3;
        private Label equal;
        private Button calculate;
    }
}
